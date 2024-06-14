<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form method="post" action="calculator.jsp">
        <label for="number1">Number 1:</label>
        <input type="text" id="number1" name="number1"><br>
        <label for="number2">Number 2:</label>
        <input type="text" id="number2" name="number2"><br>
        <label for="operation">Operation:</label>
        <select id="operation" name="operation">
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br>
        <input type="submit" value="Calculate">
    </form>

    <% 
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        String operation = request.getParameter("operation");
        if (number1 != null && number2 != null && operation != null) {
            try {
                double num1 = Double.parseDouble(number1);
                double num2 = Double.parseDouble(number2);
                double result = 0;
                String op = "";
                
                switch (operation) {
                    case "add":
                        result = num1 + num2;
                        op = "Addition";
                        break;
                    case "subtract":
                        result = num1 - num2;
                        op = "Subtraction";
                        break;
                    case "multiply":
                        result = num1 * num2;
                        op = "Multiplication";
                        break;
                    case "divide":
                        if (num2 != 0) {
                            result = num1 / num2;
                            op = "Division";
                        } else {
                            out.println("<p>Error: Division by zero.</p>");
                            return;
                        }
                        break;
                }
                out.println("<p>" + op + " Result: " + result + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p>Error: Invalid number format.</p>");
            }
        }
    %>
</body>
</html>
