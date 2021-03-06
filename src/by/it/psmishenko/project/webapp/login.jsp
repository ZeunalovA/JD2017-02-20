<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>
<form class="form-horizontal" action="do?command=login" method="POST">
<fieldset>

<!-- Form Name -->
<legend align="center">Member Login</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="login">Login</label>
  <div class="col-md-6">
  <input id="login" name="login" type="text" placeholder="login" class="form-control input-md" required="">
  <span class="help-block">Your login (min 5 symbols)</span>
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="password">Password</label>
  <div class="col-md-6">
    <input id="password" name="password" type="password" placeholder="Password" class="form-control input-md" required="">
    <span class="help-block">Your password (min 5 symbols)</span>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" class="btn btn-success">Sign Up</button>
  </div>
</div>

</fieldset>
</form>
<%@ include file="include/end-html.jsp" %>