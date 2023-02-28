<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>기본디자인아이템</title>
    <!-- 기본 css -->
    <link rel="stylesheet" href="/css/liondefault.css"></link>
    <!-- 구글 아이콘 -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <!-- 제이쿼리 -->
    <script src="js/jquery-3.6.3.min.js"></script>
</head>
<body>
    <header>
        <div class="header-link">
            <a class="btn bc11">로그인</a>
            <a class="btn bc11">회원가입</a>
            <a class="btn bc11">고객센터</a>
        </div>
        <div class="header-top">
            <div class="site-logo">
                <a href="#">중고사자</a>
                <div class="site-img">
                    <img src="/img/lion (1).png" style="width:50px;">
                </div>
            </div>
            <div class="search-box">
                <input type="text" class="input-form" placeholder="검색어를 입력하세요.">
                <button type="submit" class="search-icon">
                    <span class="material-symbols-outlined">
                        search
                    </span>
                </button>
            </div>
            <div class="member-link">
                <!-- <button class="btn bc1">마이페이지</button> -->
                <!-- <a class="btn bc1">관심상품</a> -->
                <a href="#" class="btn">
                    <span class="material-symbols-outlined">account_circle</span>
                    <p>마이페이지</p>
                </a>
                <a href="#" class="btn">
                    <span class="material-symbols-outlined">favorite</span>
                    <p>관심상품</p>
                </a>
            </div>
        </div>
        <nav>
            <ul class="navi">
                <li><a href="#">메뉴-1</a></li>
                <li class="category">
                    <a href="#">카테고리</a>
                    <!-- <ul class="sub-navi">
                        <li><a href="#">sub-1</a></li>
                        <li><a href="#">sub-2</a></li>
                        <li><a href="#">sub-3</a></li>
                        <li><a href="#">sub-4</a></li>
                        <li><a href="#">sub-5</a></li>
                        <li><a href="#">sub-6</a></li>
                    </ul> -->
                </li>
                <li><a href="#">메뉴-3</a></li>
                <li><a href="#">메뉴-4</a></li>
                <li><a href="#">메뉴-5</a></li>
            </ul>
        </nav>
        <ul class="sub-navi">
            <div>
                <p>CATEGORY</p>
                <li><a href="#">sub-1</a></li>
                <li><a href="#">sub-2</a></li>
                <li><a href="#">sub-3</a></li>
                <li><a href="#">sub-4</a></li>
                <li><a href="#">sub-5</a></li>
                <li><a href="#">sub-6</a></li>
                <li><a href="#">sub-7</a></li>
                <li><a href="#">sub-8</a></li>
                <li><a href="#">sub-9</a></li>
                <li><a href="#">sub-10</a></li>
                <li><a href="#">sub-11</a></li>
                <li><a href="#">sub-12</a></li>
                <li><a href="#">sub-13</a></li>
                <li><a href="#">sub-14</a></li>
                <li><a href="#">sub-15</a></li>
                <li><a href="#">sub-16</a></li>
                <li><a href="#">sub-17</a></li>
                <li><a href="#">sub-18</a></li>
                <li><a href="#">sub-19</a></li>
                <li><a href="#">sub-20</a></li>
                <li><a href="#">sub-21</a></li>
                <li><a href="#">sub-22</a></li>
                <li><a href="#">sub-23</a></li>
                <li><a href="#">sub-24</a></li>
                <li><a href="#">sub-25</a></li>
                <li><a href="#">sub-26</a></li>
            </div>
        </ul>



    </header>
    <script>
        $(".sub-navi").hide();
        $(".category").on("mouseenter", function(){
            $(".sub-navi").show();
            $("nav").css("border-bottom", "none");
            $(".sub-navi").on("mouseleave", function(){
                $(".sub-navi").hide();
                $("nav").css("border-bottom", "1px solid #ccc");
            });
        });


    </script>
</body>
</html>