package OOP.Seminars.Seminar_1.Ex_2;

public class Dog extends Animal{
    private String name;
    private int age;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
        public void tellAboutYOurself() {
            System.out.println("hello im a dog, my name is " + name + " my age is age " + age +
                    "my breed is " + breed);

        }
    }
