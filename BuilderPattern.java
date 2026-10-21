public class BuilderPattern {
    private String name;
    private int age;
    private BuilderPattern(Builder builder){
        this.name= builder.name;
        this.age=builder.age;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public class Builder{
        private String name;
        private int age;

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }
}
