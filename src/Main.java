import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonData = """
                {
                    "name":"Muzaffar",
                    "age":20,
                    "salary":5000000
                }
                """;

        PersonModel person = gson.fromJson(jsonData, PersonModel.class);
        System.out.println("Person name: " + person.name);

        PersonModel person1 = new PersonModel();
        person1.name = "Abror";
        person1.age = 17;
        person1.salary = 3000000;

        String json = gson.toJson(person1);
        System.out.println(json);
    }
}
