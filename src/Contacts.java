public class Contacts {
    private  String name;
    private  int idNumb;



    @Override
    public String toString() {
        return "Contact name :" + name  +
                " idNumb:" + idNumb ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumb() {
        return idNumb;
    }

    public void setIdNumb(int idNumb) {
        this.idNumb = idNumb;
    }






    public Contacts(String name, int idNumb) {
        this.name = name;
        this.idNumb = idNumb;
    }
}
