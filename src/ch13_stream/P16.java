package ch13_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Login {
    String user;
    boolean success;

    Login(String user, boolean success) {
        this.user = user;
        this.success = success;
    }

    String getUser() {
        return user;
    }

    boolean getSuccess() {
        return success;
    }
}

class UserStat {
    String user;
    long attempts;
    long successCount;
    double successRate;

    UserStat(String user, long attempts, long successCount) {
        this.user = user;
        this.attempts = attempts;
        this.successCount = successCount;
        this.successRate = attempts == 0 ? 0.0 : (double) successCount / attempts;
    }

    String getUser() {
        return user;
    }

    long getAttempts() {
        return attempts;
    }

    double getSuccessRate() {
        return successRate;
    }
}

public class P16 {
    public static void main(String[] args) {
        List<Login> logs = Arrays.asList(
                // kim
                new Login("Kim", true),
                new Login("Kim", false),
                new Login("Kim", true),
                new Login("Kim", true),
                // lee
                new Login("Lee", true),
                new Login("Lee", true),
                new Login("Lee", false),
                // park
                new Login("Park", true),
                new Login("Park", true),
                new Login("Park", true),
                new Login("Park", false),
                new Login("Park", true),
                // choi
                new Login("Choi", false),
                new Login("Choi", false),
                new Login("Choi", false),
                new Login("Choi", true),
                // jung
                new Login("Jung", true),
                new Login("Jung", true),
                // han
                new Login("Han", true),
                new Login("Han", true),
                new Login("Han", true)
        );

        // logs에서 사람마다 로그인을 시도한 횟수 = attempts

        Map<String, Long> map = logs.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n.getUser(),
                                Collectors.counting()
                        )
                );
//        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // logs에서의 사람마다 true를 얻은 횟수 - successCount
        Map<String, Long> successLogs = logs.stream()
                .filter(n -> n.getSuccess() == true)
                .map(n -> n.getUser())
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()));

//        System.out.println(successLogs);

        List<UserStat> userStats = map.entrySet().stream()
                .map(entry -> {
                    String user = entry.getKey();
                    long attempts = entry.getValue();
                    long successCount = successLogs.get(user);
                    return new UserStat(user, attempts, successCount);
                })
                .filter(n -> n.attempts >= 3)
                .sorted(Comparator.comparing(UserStat::getSuccessRate).reversed())
                .limit(3)
                .collect(Collectors.toList());

        for (UserStat userStat : userStats) {
            System.out.println( userStat.getUser() + " / " + userStat.getSuccessRate() + " ");}
    }
}
