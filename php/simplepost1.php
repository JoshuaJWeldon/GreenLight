<!DOCTYPE HTML>
<html>
    <body>

        <?php
            if($_SERVER['REQUEST_METHOD'] == 'POST') {
                // if form has been posted process data
                
                // you dont need the addContact function you jsut need to put it in a new array
                // and it doesnt make sense in this context so jsut do it here
                // then used json_decode and json_decode to read/save your json in
                // saveContact()
                
                session_start();
                
                $_SESSION['message'] = $_POST['message'];
            }
            
        ?>



        <h1 color="green">post test</h1>

        <form method="post" action="<?php echo htmlspecialchars($_SERVER[""]);?>">

            Message: <input type="text" name="message" value="">

                 <input type="submit" name="submit" value="Submit">

        </form>

        <p><a href="simplepost2.php">cont</a></p>

    </body>
</html>