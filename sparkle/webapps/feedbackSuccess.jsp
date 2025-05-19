<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Application details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <style>
        footer {
            text-align: center;
            padding: 10px;
            background-color: #000000;
            color: #3929d6;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
    <style>
        .table-row-colored {
            background-color: #e6f7ff; /* light blue */
            color: info;
        }
    </style>

</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
            </ul>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Options
                </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="feedback.jsp">FeedBack Details</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="index.jsp">Something else here</a></li>
                </ul>
            </li>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div align="center">
    <h1>Welcome to our Website!</h1>
    <h2>Thanks ${message} </h2>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">feedback</th>
            <th scope="col">rating</th>
            <th scope="col">suggestion</th>
            <th scope="col">gender</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${feedbackDto.feedback}</td>
            <td>${feedbackDto.rating}</td>
            <td>${feedbackDto.suggestion}</td>
            <td>${feedbackDto.gender}</td>
        </tr>

        </tbody>
    </table>

    <footer>Feedback @X-workz</footer>


</div>
</body>
</html>