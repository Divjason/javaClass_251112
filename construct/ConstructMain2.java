package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct1 member1 = new MemberConstruct1("user1", 15, 90);
        MemberConstruct1 member2 = new MemberConstruct1("user2", 16);

        MemberConstruct1[] members = {member1, member2};

        for (MemberConstruct1 s: members) {
            System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", s.name, s.age, s.grade);
        }
    }
}
