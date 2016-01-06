<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


				
				<!-- Section message  reseaux ..... -->
				
				<section class="sectionclass">
				
				<a data-toggle="modal" href="#achatDeProduit" class="btn btn-primary btn-lg">Achat</a>
        <br>
        <a data-toggle="modal" href="#createProduct" class="btn btn-primary btn-lg">Nouveau produit</a>
        <a data-toggle="modal" href="#createProduct" class="btn btn-primary btn-lg">Nouvelle annonce</a>
        <a data-toggle="modal" href="#createProduct" class="btn btn-primary btn-lg">Nouvelle enchère</a>
        <br>
        <a data-toggle="modal" href="#paiment" class="btn btn-primary btn-lg">Paiment</a>

        <!-- product's detail Modal -->
        <div class="modal fade" id="achatDeProduit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Achat</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-xs-8"><img class="img-thumbnail" width="100%" src="assets/uploads/iphone.jpg"></div>
                            <div class="col-xs-4">
                                <dl>
                                    <dt>Code</dt>
                                    <dd><span class="text-muted">HG65839</span></dd>

                                    <dt>Nom</dt>
                                    <dd><span class="text-muted">Iphone Air 128Gb</span></dd>

                                    <dt>Prix</dt>
                                    <dd><span class="text-muted">7 000 DHs</span></dd>
                                </dl>
                            </div> 
                        </div>
                        <div class="row">
                            <div class="col-xs-8">
                                <small>01/03/1000</small>
                                <small class="pull-right">By Hic2h</small>
                            </div>
                            <div class="col-xs-4 text-right">
                                <a href=""><i class="fa fa-share" title="Commercialiser par votre Entreprise"></i></a>
                                <a href=""><i class="fa fa-shopping-cart" title="Ajouter au Panier"></i></a>
                                <a href=""><i class="fa fa-money" title="Acheter Maintenant"></i></a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <ul class="nav nav-tabs">
                                    <li><a href="#description" data-toggle="tab">Description</a></li>
                                    <li><a href="#specification" data-toggle="tab">Specification</a></li>
                                    <li><a href="#images" data-toggle="tab">Images</a></li>
                                    <li><a href="#revue" data-toggle="tab">Revue</a></li>
                                </ul>

                                <div class="tab-content">
                                    <div class="tab-pane active" id="description">
                                        <small>wa7e9 llah ila had l iphone jdid, chratoli mama f 3id miladi, dewezt bih 2 simanat o daba baghi nbi3o</small>
                                    </div>
                                    <div class="tab-pane" id="specification">specification</div>
                                    <div class="tab-pane" id="images">images</div>
                                    <div class="tab-pane" id="revue">revue</div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><b>Commercialiser</b></button>
                        <button type="button" class="btn btn-default btn-sm"><b>Ajouter au Panier</b></button>
                        <button type="button" class="btn btn-primary btn-sm"><b>Acheter</b></button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Creating product Modal -->
        <div class="modal fade" id="createProduct" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <f:form  modelAttribute="produitARemplir" action="ajouterProduit" enctype="multipart/form-data">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">Nouveau produit</h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-xs-12"><h4 style="text-align:center">Code du produit: HS782035</h4></div>
                            </div>
                            <div class="row">
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <label for="nameInput">Nom</label>
                                        <f:input path="designation" class="form-control" id="nameInput" placeholder="Nom du produit" />
                                    </div>
                                    <div class="form-group">
                                        <label for="priceInput">Prix</label>
                                        <f:input path="prix" class="form-control" id="priceInput" placeholder="Prix du produit" />
                                    </div>
                                    <div class="form-group">
                                        <label for="cateInput">Catégorie</label>
                                        
                                        <f:select  path="categorie.idCategorie" cssClass="form-control" id="categorie">
											<f:option value="NONE"> --Categorie--</f:option>
										    <f:options items="${categories}" itemValue="idCategorie" itemLabel="nomCategorie" ></f:options>
										</f:select>
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <img src="http://placehold.it/220x150" style="margin-bottom:10px"><BR>
                                    <input id="myfileinp" style="visibility: hidden;"  type="file" name="file" />
                                    <button type="button" class="btn btn-xs btn-primary" onclick="document.getElementById('myfileinp').click();">Parcourir...</button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="descriptionInput">Description</label>
                                        <f:textarea path="description" class="form-control" id="descriptionInput" rows="3" />
                                    </div>
                                    <div class="form-group">
                                        <label for="specInput">Specification</label>
                                        <f:textarea path="specification" class="form-control" id="specInput" rows="3" />
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="submit" class="btn btn-primary btn-sm"><b>Ajouter</b></button>
                        </div>
                    </f:form>
                </div>
            </div>
        </div>


        <!-- Paiment Modal -->
        <div class="modal fade" id="paiment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form role="form">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">Paiement</h4>
                        </div>
                        <div class="modal-body">
                            <div class="panel-group" id="resume">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseResume">
                                            Resumé
                                        </a>
                                        </h4>
                                    </div>
                                    <div id="collapseResume" class="panel-collapse collapse in">
                                        <div class="panel-body">
                                            <table class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th>#</th>
                                                        <th>Nom</th>
                                                        <th class="col-xs-1">Quantité</th>
                                                        <th>Prix unitaire</th>
                                                        <th>Prix total</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>KG8972</td>
                                                        <td>Sberdila niyka</td>
                                                        <td><input class="form-control input-sm" value="1"  type="number"></td>
                                                        <td style="text-align:right">350</td>
                                                        <td style="text-align:right">350</td>
                                                    </tr>
                                                    <tr>
                                                        <td>HS7825</td>
                                                        <td>preservatif</td>
                                                        <td><input class="form-control input-sm" value="1" type="number"></td>
                                                        <td style="text-align:right">60</td>
                                                        <td style="text-align:right">60</td>
                                                    </tr>
                                                    <tr style="text-align:right">
                                                        <td colspan="4">Total:</td>
                                                        <td>410</td>
                                                    </tr> 
                                                    <tr style="text-align:right">
                                                        <td colspan="4">Prix de la livraison:</td>
                                                        <td>30</td>
                                                    </tr> 
                                                    <tr style="text-align:right">
                                                        <td colspan="4">Total à payer:</td>
                                                        <td>440</td>
                                                    </tr> 
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseeKenzyAccount">
                                            <input type="radio" name="optionsRadios" value="option1"> Paiement par compte eKenzy
                                        </a>
                                        </h4>
                                    </div>
                                    <div id="collapseeKenzyAccount" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <div class="col-md-12">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <p>Votre compte:</p>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p style="text-align:right">43 943 DHs</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <button class="btn btn-primary btn-xs pull-right">Confirmer</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseCreditCardAccount">
                                            <input type="radio" name="optionsRadios" value="option2"> Paiement par carte bancaire
                                        </a>
                                        </h4>
                                    </div>
                                    <div id="collapseCreditCardAccount" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <div class="col-md-12">
                                                <div class="row">
                                                    <div class="col-md-offset-2 col-md-8">
                                                        <form role="form">
                                                            <div class="form-group">
                                                                <label for="cardNumberInput">Card Number</label>
                                                                <input type="text" class="form-control" id="cardNumberInput">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="holdersName">Card holder's name</label>
                                                                <input type="text" class="form-control" id="holdersName">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="expiryDate">expiry date</label>
                                                                <input type="text" class="form-control" id="expiryDate">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="verificationCod">Card verification code</label>
                                                                <input type="text" class="form-control" id="verificationCod">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="email">Email</label>
                                                                <input type="text" class="form-control" id="email">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="address">Address</label>
                                                                <input type="text" class="form-control" id="address">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="indication">Indication</label>
                                                                <input type="text" class="form-control" id="indication">
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <button class="btn btn-primary btn-xs pull-right">Confirmer</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseLivraison">
                                            <input type="radio" name="optionsRadios" value="option3"> Paiement à la livraison (10 DHs des frais ajoutés pour cette option)
                                        </a>
                                        </h4>
                                    </div>    
                                    <div id="collapseLivraison" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <div class="col-md-12">
                                                <div class="row">
                                                    <div class="col-md-offset-2 col-md-8">
                                                        <form role="form">
                                                            <div class="form-group">
                                                                <label for="fullName">Nom Complet</label>
                                                                <input type="text" class="form-control" id="fullName">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="email">Email</label>
                                                                <input type="text" class="form-control" id="email">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="address">Address</label>
                                                                <input type="text" class="form-control" id="address">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="indication">Indication</label>
                                                                <input type="text" class="form-control" id="indication">
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <button class="btn btn-primary btn-xs pull-right">Confirmer</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary btn-sm"><b>Annuler</b></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
				
									
				</section>
						 
			 
		</div>
	</div>
	