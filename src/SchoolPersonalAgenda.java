public class SchoolPersonalAgenda {
    private Contacts[] contacts;

    public SchoolPersonalAgenda() {
        this.contacts = new Contacts[250];
    }

    public SchoolPersonalAgenda(int sizeAgenda) {

        this.contacts = new Contacts[sizeAgenda];
    }

    public void addContacts(Contacts c) {

        if (existContacts(c)) {
            System.out.println("CONTACT EXISTS , TRY ANOTHER ONE");
        } else if (agendaFull()) {
            System.out.println("FULL AGENDA ,PLEASE DELETE EXISTING ONES");
        } else {

            boolean find = false;
            for (int i = 0; i < contacts.length && !find; i++) {
                if (contacts[i] == null) {
                    contacts[i] = c;
                    find = true;
                }
            }
            if (find) {
                System.out.println("YOU ADD ANEW CONTACT : ");
            } else {
                System.out.println("ERROR NO CONTACT CREATED !!!");

            }

        }
    }

    public boolean existContacts(Contacts c) {
        boolean find = false;
        for (int i = 0; i < contacts.length && !find; i++) {
            if (contacts[i] != null && c.equals(contacts[i])) {
                return true;
            }
        }
        return false;
    }

    public void showAllContacts() {

        if (freeContactSpace() == contacts.length) {
            System.out.println("NO CONTACTS TO SHOW");
        } else {
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] != null) {
                    System.out.println(contacts[i]);
                }
            }
        }
    }



    public void searchByName(String name) {
        boolean find = false;
        for (int i = 0; i < contacts.length && !find; i++) {
            if (contacts[i] != null && contacts[i].getName().trim().equalsIgnoreCase(name.trim())) {
                System.out.println("YOUR NUMBER IS " + contacts[i].getIdNumb());
                find = true;
            }

        }
        if (!find) {
            System.out.println("CONTACT NOT FOUND");
        }
    }

    public boolean agendaFull() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void deleteContact(Contacts c) {
        boolean find = false;
        for (int i = 0; i < contacts.length && !find; i++) {
            if (contacts[i] != null && contacts[i].equals(c)) {
                contacts[i] = null;
                find = true;
            }
        }
        if (find) {
            System.out.println("YOU HAVE DELETE A CONTACT");
        }else {
            System.out.println("ERROR , CONTACT IT'S NOT DELETED");
        }

    }

    public int freeContactSpace() {
        int freeSpaceCounter = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                freeSpaceCounter++;
            }
        }
        return freeSpaceCounter;
    }
}
