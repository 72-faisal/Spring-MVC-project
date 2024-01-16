<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Loan Calculation Result</title>
    <%-- <link rel="stylesheet" href="<c:url value='/styles.css' />"> --%>
</head>
<body>
    <div class="calculator-container">
        <h2>Loan Calculation Result</h2>

        <div id="result">
            <h3>Monthly Payment:</h3>
            <p id="monthlyPayment">${LoanCalc.monthlyPayment}</p>
        </div>

        <a href="/">Back to Loan Calculator</a>
    </div>
</body>
</html>

