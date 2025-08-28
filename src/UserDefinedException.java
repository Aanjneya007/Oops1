public class UserDefinedException extends Exception {
        public void validate(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("Not eligible");
            }
            else{
                System.out.println("Eligible");
            }
    }
}
