<!DOCTYPE html>
<html>
<head>
    <title>Student Information Form</title>
</head>
<body>
    <h1>Enter Student Information</h1>
    <form method="post" action="StudentServlet">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        <label for="age">Age:</label>
        <input type="text" id="age" name="age"><br>
        <label for="grade">Grade:</label>
        <input type="text" id="grade" name="grade"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
