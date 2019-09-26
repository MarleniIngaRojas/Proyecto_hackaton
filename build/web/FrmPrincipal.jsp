<!doctype html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>SisServicios</title>
          <a href="img/logo.ico"></a>
          <link rel="icon" href="img/logo.ico" />
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- owl carousel CSS -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <!-- themify CSS -->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- flaticon CSS -->
        <link rel="stylesheet" href="css/flaticon.css">
        <!-- font awesome CSS -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- swiper CSS -->
        <link rel="stylesheet" href="css/slick.css">
        <link rel="stylesheet" href="css/all.css">
        <!-- style CSS -->
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <!--::header part start::-->
        <header class="main_menu">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-12">
                        <nav class="navbar navbar-expand-lg navbar-light">
                            <a class="" href="FrmPrincipal.jsp"> <img src="img/logo.jpg" alt="logo"> </a>
                            
                               <button class="navbar-toggler" type="button" data-toggle="collapse"
                                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                    aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                               </button>

                            <div class="collapse navbar-collapse main-menu-item justify-content-end"
                                 id="navbarSupportedContent">
                                <ul class="navbar-nav">
                                    <li class="nav-item active">
                                        <a class="nav-link" href="FrmPrincipal.jsp">Inicio</a>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link" href="">Servicios</a>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link" href="login/index.html">salir</a>
                                    </li>

                                </ul>
                            </div>
                        </nav>
                    </div>

                </div>
                


            </div>


        </header>
        <!-- Header part end-->

        <!-- breadcrumb start-->

        <!-- breadcrumb start-->



        <!-- cta_part start -->
        <section class="cta_part">
            <div class="container">
                <div class="form-group col-sm-12 col-md-12 col-xl-12">

                    <select class="form-control" required>
                        <option value="">Seleccione Tipo de servicio </option>
                        <option value="1">Guia de Turimo</option>
                        <option value="2">Servicios Tecnicos</option>
                    </select>

                </div>

                <div class="content-wrapper">
                    <!-- START PAGE CONTENT-->

                    <div class="page-content fade-in-up">
                        <div class="row">
                            <div class="col-md-8 col-sm-8 col-xs-8">
                                <div class="ibox">
                                    <div class="ibox-head bg-dark text-white">

                                        <h2 style="color:#FF0000">Lista de Servicios</h2>
                                    </div>
                                    <div class="ibox-body">
                                        <div class="form-group col-sm-8 col-md-8 col-xl-8">

                                            <select class="form-control" required>
                                                <option value="">Seleccione una Categoria </option>
                                                <option value="1">Electricidad</option>
                                                <option value="2">Tapiceria</option>
                                                <option value="2">Soldaduria</option>
                                                <option value="2">Gia Turismo</option>
                                                <option value="2">Bar Tender</option>
                                                <option value="2">Mesero</option>
                                            </select>

                                        </div>


                                        <div class="form-group col-sm-2 col-md-2 col-xl-2">
                                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">Contratar</button>
                                            <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-hidden="true">
                                                <div class="modal-dialog modal-ms">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
                                                            </button>
                                                            <h4 class="modal-title" id="myModalLabel2">Contratar</h4>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">
                                                                <h4 align="left">Nombre</h4>
                                                                <input type="text" class="form-control" readonly=»readonly»/>

                                                            </div>
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">

                                                                <h4 align="left">Apellido</h4>
                                                                <input type="text" class="form-control" readonly=»readonly»/>

                                                            </div>
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">

                                                                <h4 align="left">Telefono</h4>
                                                                <input type="text" class="form-control" readonly=»readonly»/>

                                                            </div>
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">

                                                                <h4 align="left">servicio</h4>
                                                                <input type="text" class="form-control" readonly=»readonly»/>

                                                            </div>
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">

                                                                <h4 align="left">Tipo de servicio</h4>
                                                                <input type="text" class="form-control" readonly=»readonly»/>

                                                            </div>
                                                            <div class="form-group col-sm-12 col-md-12 col-xl-12">

                                                                <h4 align="left">Fecha</h4>
                                                                <input type="text" class="form-control" />

                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                                                            <button type="button" class="btn btn-primary">Generar Contrato</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>


                                        <div class="table-responsive">
                                            <table class="table">
                                                <thead>

                                                    <tr>
                                                        <th>Codigo</th>
                                                        <th>Nombre</th>
                                                        <th>proveedor</th>
                                                        <th>Detalle</th>
                                                        <th>Categoria</th>
                                                        <th>precio</th>
                                                        <th>valorizacion</th>
                                                        <th>Cantidad Contratos</th>


                                                    </tr>

                                                    <tr>
                                                        <td>1</td>
                                                        <td>Luces Interiores</td>
                                                        <td>Electro Sac</td>
                                                        <td>Intalacion de Luces para interiores</td>
                                                        <td>Electricidad</td>
                                                        <td>45</td>
                                                        <td>10</td>
                                                        <td>20</td>

                                                    </tr>

                                                </thead>
                                            </table>

                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-4 col-sm-4 col-xs-4">
                                <div class="ibox">
                                    <div class="ibox-head bg-dark text-white">
                                        <h2 style="color:#FF0000">Catalogo</h2>

                                    </div>
                                    <div class="ibox-body">
                                        <div class="table-responsive">
                                            <table class="table ">
                                                <div class="col-md-12">
                                                    <div class="x_panel">
                                                        <div class="x_title">
                                                           
                                                            <div class="clearfix"></div>
                                                        </div>
                                                        <div class="x_content">
                                                            <div class="row">
                                                                <p></p>
                                                                <div class="col-md-6">
                                                                    <div class="thumbnail">
                                                                        <div class="image view view-first">
                                                                            <img style="width: 100%; display: block;" src="img/luces1.jpg" alt="image">
                                                                            
                                                                        </div>
                                                                        <div class="caption">
                                                                            <p>Luces de interiores</p>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <div class="thumbnail">
                                                                        <div class="image view view-first">
                                                                            <img style="width: 100%; display: block;" src="img/luces2.jpg" alt="image">
                                                                           
                                                                        </div>
                                                                        <div class="caption">
                                                                            <p>Luces de interiores</p>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <div class="thumbnail">
                                                                        <div class="image view view-first">
                                                                            <img style="width: 100%; display: block;" src="img/luces4.jpg" alt="image">
                                                                           
                                                                        </div>
                                                                        <div class="caption">
                                                                            <p>Luces de interiores</p>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                
                                                                <div class="col-md-6">
                                                                    <div class="thumbnail">
                                                                        <div class="image view view-first">
                                                                              <img style="width: 100%; display: block;" src="img/luces3.jpg" alt="image">
                                                                        </div>
                                                                        <div class="caption">
                                                                          
                                                                            <p>Luces de interiores</p>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            

 
                             
                        </div>
                    </div>

                </div>

        </section>
        <!-- cta_part start -->

        <!-- service_part start -->

        <!-- service_part end -->

        <!--::review_part start::-->

        <!--::blog_part end::-->

        <!-- footer part start-->
        <footer class="footer-area">


            <div class="col-lg-12">
                <div class="copyright_part_text text-center">
                    
                    <div class="row">
                        <div class="col-lg-8">
                            <p class="footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                SisServicios<script>document.write(new Date().getFullYear());</script>Sistema de Servicios <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Hackaton</a>
                               <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                        </div>
                    </div>
                    
                </div>
            </div>


        </footer>
        <!-- footer part end-->

        <!-- jquery plugins here-->
        <!-- jquery -->
        <script src="js/jquery-1.12.1.min.js"></script>
        <!-- popper js -->
        <script src="js/popper.min.js"></script>
        <!-- bootstrap js -->
        <script src="js/bootstrap.min.js"></script>
        <!-- easing js -->
        <script src="js/jquery.magnific-popup.js"></script>
        <!-- swiper js -->
        <script src="js/swiper.min.js"></script>
        <!-- swiper js -->
        <script src="js/masonry.pkgd.js"></script>
        <!-- particles js -->
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/owl.carousel2.thumbs.min.js"></script>
        <!-- swiper js -->
        <script src="js/slick.min.js"></script>
        <!-- custom js -->
        <script src="js/custom.js"></script>
    </body>

</html>
