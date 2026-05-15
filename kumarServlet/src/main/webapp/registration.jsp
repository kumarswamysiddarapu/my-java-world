<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<style>
    body { font-family: Arial; }
    input, select, textarea {
        display: block;
        margin: 8px 0;
        padding: 6px;
        width: 250px;
    }
    button {
        padding: 8px;
        background-color: green;
        color: white;
        border: none;
    }
</style>
</head>

<body>

<h3>Register your details</h3>

<form action="register" method="post">

    <input type="text" name="firstName" placeholder="First Name" required>
    <input type="text" name="middleName" placeholder="Middle Name">
    <input type="text" name="lastName" placeholder="Last Name" required>

    <label>DOB:</label>
    <input type="date" name="dob" required>

    <input type="text" name="nationality" placeholder="Nationality" required>

    <input type="text" name="fatherName" placeholder="Father Name" required>
    <input type="text" name="motherName" placeholder="Mother Name" required>

    <label>Gender:</label>
    <select name="gender">
        <option value="male">Male</option>
        <option value="female">Female</option>
    </select>

    <input type="text" name="phone" placeholder="Phone">
    <input type="email" name="email" placeholder="Email">

    <textarea name="address" placeholder="Address"></textarea>

    <input type="text" name="course" placeholder="Course">

    <button type="submit">Register</button>

</form>

</body>
</html>