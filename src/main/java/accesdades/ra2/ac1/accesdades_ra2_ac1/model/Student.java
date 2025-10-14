package accesdades.ra2.ac1.accesdades_ra2_ac1.model;

// Model de dades Estudiant
public class Student {
    private Long id;
    private String name;
    private int age;

    // Getters i setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    
    // Constructors
    public Student(){
        
    }
    
    public Student(int age, Long id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
    
}