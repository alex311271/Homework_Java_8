public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Антон";
        post.surname = "Чехов";
        post.patronymic = "Павлович";
        post.passport = "1234 № 567890";
        post.phone = "+7(123) 456-78-09";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 29;
        post.birthday.month = 1;
        post.birthday.year = 1860;

    }

}
