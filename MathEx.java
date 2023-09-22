public class MathEx{
    public static void main(String[] args){
        System.out.println(swap(123));
        System.out.println(swap(456));
        System.out.println(swap(789));
    }
    public static int swap(int x){
        int answer = (x/10)%10;
        int answer2 = x/100;
        int answer3 = x%10;
        int result = (answer2*100) + (answer3*10) + answer;
        return result;
    }

    }

    public static void timeLeft(int a, int b, int c, int d){
        int curHour = a*60;
        int depHour = c*60;
        int curMin = curHour + b;
        int depMin = depHour + d;

        int ok = depMin - curMin;
        int ok2 = ok/60;
        int ok3 = ok%60;
        System.out.println(ok + ("Hours and ") + ok3("minutes"));
    }

