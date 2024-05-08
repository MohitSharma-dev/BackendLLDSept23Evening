package IntroToOOP;

public class Exam {
    int exam_id;
    int score;
    ReattemptExam reattemptExam;

    Exam(int exam_id, int score) {
        this.exam_id = exam_id;
        this.score = score;
        this.reattemptExam = new ReattemptExam(exam_id, score);
    }

    Exam(Exam other) {
        this.exam_id = other.exam_id;
        this.score = other.score;
        // this is not a good thing and it is called shallow copy
        this.reattemptExam = other.reattemptExam;
        // this is correct
        this.reattemptExam = new ReattemptExam(other.reattemptExam.reattemptExamId , other.reattemptExam.reattemptExamScore);
    }
}
