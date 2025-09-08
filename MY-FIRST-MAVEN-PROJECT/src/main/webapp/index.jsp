<html>
<body>
	<form  action="StudentServlet"  method="get">
		<table border="1">
			<tr>
				<td colspan="2" style="text-align:center;">
					<h2>Registration</h2>
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input  type="text" name="stdName" required>
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>
					<input  type="email" name="stdEmail" required>
				</td>
			</tr>
			<tr>
				<td>Pass</td>
				<td>
					<input  type="password" name="stdPass" required>
				</td>
			</tr>
			<tr>
				<td>Add</td>
				<td>
					<input  type="text" name="stdAdd" required>
				</td>
			</tr>
			<tr>
					<td colspan="2" style="text-align:center; ">
						<input  type="submit" value="Submit" style="background-color:green;" >
					</td>
			</tr>

		</table>

	</form>

	<br>
	<a href="StudentViewServlet">View Students</a>
</body>
</html>
