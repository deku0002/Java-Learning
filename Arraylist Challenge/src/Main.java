//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MobilePhone mob = new MobilePhone("9494949494");
        mob.addNewContact(Contact.createContact("BabaJi","9534344334"));
        mob.printContacts();
    }
}