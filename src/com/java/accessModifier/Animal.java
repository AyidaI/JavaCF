package com.java.accessModifier;

public class Animal {

    public String namePublic;
    protected int ageProtected;
    String colorDefault;
    private double weightPrivate;

    public void eatPublic() {
        System.out.println("Eat" + weightPrivate);
    }

    protected void runProtected() {
        System.out.println("Run");
    }

    private void sleepPrivate() {
        System.out.println("Sleep" + weightPrivate);
    }

    void jumpDefault() {
        System.out.println("Jump");
    }
}
