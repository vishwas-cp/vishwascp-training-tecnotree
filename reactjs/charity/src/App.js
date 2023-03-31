import logo from './logo.svg';
import './App.css';
import './components/style.css'

function App() {
  return (
    <>
    <div className="App">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"></link>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
		integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous"></link>

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/hover.css/2.3.1/css/hover-min.css"
		type="text/css" />
	
	<link rel="stylesheet" href="assets/css/style.css" type="text/css"/>
     
     <header>
		<nav class="navbar navbar-expand-sm  navbar-light fixed-top">

			
			<a href="index.html" class="navbar-brand navBrandColor">Charity Base</a>

			<button class="navbar-toggler ml-auto" data-toggle="collapse" data-target="#navbarNavDropdown" aria-expanded="navbarNavDropdown" aria-controls="false">

            <span class="navbar-toggler-icon"></span></button>

			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a href="index.html" class="nav-link hvr-shutter-out-vertical">Home</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link hvr-shutter-out-vertical">Map</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link hvr-shutter-out-vertical">Statistics</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link hvr-shutter-out-vertical">Donate</a>
					</li>
					<li class="nav-item">
						<a href="#" class="nav-link hvr-shutter-out-vertical">Contacts</a>
					</li>
				</ul>
			</div>
		</nav>
	</header>
	<article>



		<section class="hpimg-1" title="A background picture of a child that looks sad and sits on the ground">
			<div id="textEffect">
				<div class="container-fluid">
					<div class="row">
						<div class="col-11 col-xl-8">
							<div class="top-section textHP1 text-center">
								<h1>Help People In Need</h1>
								<p class="text">Around 795 million people in the world do not have enough food, in order
									to live a healthy and active life. However, you can help solving this problem by
									donating to save lives and help to change a part of this world!
									<br></br>
									<a href="#" class="btn donateButtonStyleHP">Donate here</a>
								</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-11 col-xl-8">
							<div class="top-section-counter-BG text-center textHP1">
								<div id="counter"></div>
								<div id="death"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>




		<section class="hpimg-2" title="A background picture of a child hugging another, while both of them are looking at the camera and standing in dirt">
			<div class="container-fluid section">
				<div class="row">
					<div class="col-sm-12 text-center">
						<h2>The Poverty Trap</h2>
						<p class="text ">When a country does not have a enough capital, i.e. machinary, tools and
							buildings, people strive to produce goods and services. Therefore, their economic
							development and growth decreases and it becomes difficult to gain the
							capital that they require. As a result, they get trapped into a poverty cycle. However,
							you could change lives today by donating! Find more information, <a
								href="#">here!</a>
						</p>
					</div>
				</div>
			</div>
		</section>

	

		<section class="hpimg-3" title="A background picture of three children with empty cups in their hands and standing by a wall, while looking sad">
			<div class="container-fluid section">
				<div class="row">
					<div class="col-sm-12 text-center">
						<h2>The Struggle for Food and Health Care</h2>
						<p class="text">In some countries, a single plate of food can even cost up to around 70$ or
							even about 200$. About 45% children, under the age of five, are caused to pass away, due
							to malnutrition. In many countries, people live in slums,
							ran away, suffer mentally and physically from wars, got affected by natural disasters,
							etc. <span id="dots1" class="dots">...</span><span id="more1" class="more">So, they do not have much access to nutritions, medications or shelter and require various
                                kinds of support! For statistics, please click <a href="#">here!</a>
                            </span>
							<button id="readBtn1" class="readBtn">Read More</button></p>
					</div>
				</div>
			</div>
		</section>



		<section class="hpimg-4" title="A background picture of a child that is so thin that its ribs can be seen, while it is surrounded by people">
			<div class="container-fluid section">
				<div class="row">
					<div class="col-sm-12 mx-auto text-center">
							<h2>Lowest Economic Outputs</h2>
							<p class="text">
								The GDP per capital and GDP growth play huge roles in a country's economic status, as
								they show measurements of a country's standard of living, how prosperous the citizens of
								a country feel, and how fast a country's economy is growing.
								<span id="dots2" class="dots">...</span><span id="more2" class="more">These are very low
                                in many countries as there are multiple problems, such as the status of their labour, lands, capital and enterprises. For statistics, please click <a href="statistics.html">here!</a></span>
								<button id="readBtn2" class="readBtn">Read More</button>
							</p>

							<p class="MotherTeresaQuote text-center">
								"It is not how much we give, but how much love we put into giving." <br />- Mother Teresa
                            </p>
						</div>
					</div>
				</div>
			
		</section>

	

		<section class="hpimg-5" title="A background picture of a child that looks sad and sits on the ground">
			<div class="container section">
				<div class="row">
					<div class="col-12">
						<div class=" scroll-effect">
							<h2>Please Donate!</h2>
							<p class="text">You could save someone, now!</p>
							<a href="#" class="btn btn-primary donateButtonStyleHP">Donate here</a>
						</div>
					</div>
				</div>
			</div>
		</section>
	</article>




	<footer id="footer">
		<div class="container-fluid">
			<div class="row">
				<div class="col-12 col-sm-6 text-center">
					<ul class="footer-list">
						<li><a href="tel: 12 3456 7890" class="footer-link">Phone number: 12 4567 7890</a></li>
						<li><a href="#" class="footer-link">Send Me a Message</a></li>
					</ul>
				</div>
				<div class="col-12 col-sm-6 text-center">
					<ul class="footer-list">
						<li><a href="#" class="footer-link">Donate</a></li>
						<li><a href="#" class="footer-link">Map</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="d-block d-sm-none">
			<hr></hr>

	

			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
						<ul class="social-media-icons-footer">
							<li class="facebook-footer"><a href="http://www.facebook.com"
									target="_blank"><i class="fab fa-facebook"></i></a></li>
							<li class="twitter-footer"><a href="http://www.twitter.com"
									target="_blank"><i class="fab fa-twitter"></i></a></li>
							<li class="youtube-footer"><a href="http://www.youtube.com"
									target="_blank"><i class="fab fa-youtube"></i></a></li>
							<li class="instagram-footer"><a href="http://www.instagram.com"
									target="_blank"><i class="fab fa-instagram"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</footer>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
	</script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
	</script>

	<script src="assets/js/homepage.js"></script>





    </div>
    </>
  );
}

export default App;