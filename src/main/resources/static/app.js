function populate() {
    if (quiz.isEnded()) {
        showScores();
    } else {
        //show question
        var element = document.getElementById("question");
        element.innerHTML = quiz.getQuestionIndex().text;

        //show choices
        var choices = quiz.getQuestionIndex().choices;
        for (var i = 0; i < choices.length; i++) {
            var element = document.getElementById("choice" + i);
            element.innerHTML = choices[i];
            guess("btn" + i, choices[i]);
        }
    }
};

function guess(id, guess) {
    var button = document.getElementById(id);
    button.onclick = function () {
        quiz.guess(guess);
        populate();

    }
}

function showScores() {
    var gameOverHtml = "<h1>Result</h1>";
    gameOverHtml += "<h2 id='score'> Your scores: " + quiz.score + "</h2>";
    var element = document.getElementById("quiz");
    element.innerHTML = gameOverHtml;

}

var questions = [
    new Question("Which", ["1", "2", "that", "4"], "4"),
    new Question("When", ["11", "12", "13", "then"], "then"),
    new Question("Why", ["21", "because", "23", "24"], "because")
];

var quiz = new Quiz(questions);

populate();
