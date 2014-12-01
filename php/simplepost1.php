<!DOCTYPE HTML>
<html>
    <body>

        <?php
            // define variables and set to empty values
            $_POST["message"] = "hi";
            echo $_POST["message"];
        ?>



        <h1 color="green">post test</h1>

        <form method="post" action="<?php echo htmlspecialchars($_SERVER[""]);?>">

            Message: <input type="text" name="message" value="">

                 <input type="submit" name="submit" value="Submit">

        </form>

        <p><a href="simplepost2.php">cont</a></p>

    </body>
</html>