<a href="http://localhost:8080/getALL">Click Here To See All Data</a>

<h3>Add New User</h3>
${added}
<form>
<input name="username" type="text" placeholder="enter username"><br>
<input name="password" type="password" placeholder="enter password"><br>
<input name="firstname" type="text" placeholder="enter firstname"><br>
<input name="lastname" type="text" placeholder="enter lastname"><br>
<input name="dateofbirth" type="text" placeholder="enter DOB"><br>
<input name="email" type="text" placeholder="enter email"><br>
<input type="submit" value="add" formaction="add"><br>
</form>
<h3>Edit Existing User</h3>
${Edited}
<form>
<input name="username" type="text" placeholder="enter username"><br>
<input name="password" type="password" placeholder="enter password"><br>
<input name="firstname" type="text" placeholder="enter firstname"><br>
<input name="lastname" type="text" placeholder="enter lastname"><br>
<input name="dateofbirth" type="text" placeholder="enter DOB"><br>
<input name="email" type="text" placeholder="enter email"><br>
<input type="submit" value="update" formaction="update"><br>
</form>
<h3>Delete Existing User</h3>
${deleted}
<form>
<input name="username" type="text" placeholder="enter username"><br>
<input type="submit" value="delete" formaction="delete"><br>
</form>