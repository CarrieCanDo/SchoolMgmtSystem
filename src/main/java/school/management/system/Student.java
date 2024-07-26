package school.management.system;

/** This class is responsible for keeping track of students
 * fees, name, id, grade, and fees paid.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Role of the constructor is to create a new student object by initializing the values
     * Fees for every student is $30,000/year
     * Fees paid initially is 0.
     *
     * @param id    id for the student: unique
     * @param name  name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

        //Not going to alter student's name, student's id.

        /**
         * Used to update the student's grade.
         * @param grade new grade of the student.         *
         */

        public void setGrade(int grade) {
            this.grade = grade;

            /**
             * Keep adding the fees to feesPaid Field.
             * Add the fees to the fees paid
             * The school is going to receive the funds
             * @param fees fees that the student pays
             */

            public void updateFeesPaid(int fees){
                feesPaid += fees;

            }
        }


    }

}
