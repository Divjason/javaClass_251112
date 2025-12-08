package extend1.access.parent;

public class Parent {
    /*
    public : 모든 외부 호출 허용
    protected : 같은 패키지 안에서 호출 허용 (단, 패키지가 달라도 상속 허용)
    default : 같은 패키지 안에서 호출 허용
    private : 모든 외부 호출을 막는다
    */
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("=== Parent 메서드 ===");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        defaultMethod();
        privateMethod();
    }
}
