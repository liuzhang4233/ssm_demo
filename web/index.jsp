<html>

<script src="./j/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    function bbb() {
        alert("bbb")
       alert($("#bbb").val())
    }

    function ccc() {
        alert("ccc")
        alert($("#pwd").val())
    }
</script>
<body>
<h2>Hello World!</h2>
<form action="/login" method="get">
    <input type="text" id="name" name="name"><br>
    <input type="text" id="pwd" name="pwd"><br>
    <input type="text" id="bbb" name="bbb"><br>
    <input type="submit" value="aaa">
    <input type="button" onclick="ccc()" value="bbb">
</form>

<input type="button" onclick="bbb()" value="bbb">
</body>
</html>
