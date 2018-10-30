/**
 *  入口文件索引
 *  使用说明：将此文件引入到页面中，可在script标签上定义一个data-main=""属性，
 *  此属性指定页面入口文件。
 *
**/
(function () {

    var entry,
        // 配置所有应用的入口文件，程序将会按照data-main属性中设置的值进行索引查找
        // 如果你在引入此脚本的script标签上没有设置data-main属性，程序将会默认访问home.js文件
        app = {
            // home :  '{/}js/home',
            login : '{/}login'
        };

    (function(){

        var dataMain, scripts = document.getElementsByTagName('script'),
            eachScripts = function(el){
                dataMain = el.getAttribute('data-main');
                if(dataMain){
                    entry = dataMain;
                }
            };

        [].slice.call(scripts).forEach(eachScripts);

    })();

    // layui.config({
    //     base: 'assets/lay/modules/'
    // }).extend(app).use(entry || 'home');

})();


//控制养生最后一项的margin值为0
$(document).ready(function() {
    $(".ysbnt ul li:last").css("margin-right","0px");
});

//控制养生按钮鼠标移动上去或者点击时的状态
$(document).ready(function() {
    $(".ysbnt ul li").click(function(){
        $(this).css("background","url(../images/index_22.png)").siblings().css("background","url(../images/index_23.png)");
        var ysindex=$(this).index();
        var nowcontent=$(".ys-content")[ysindex];
        $(nowcontent).show().siblings(".ys-content").hide();
    });
});

$(document).ready(function() {
    $($(".p-list ul li")[0]).css("margin-left","0px");
    $($(".p-list ul li")[2]).css("margin-right","0px");
    $($(".p-list ul li")[3]).css("margin-left","0px")
    $($(".p-list ul li")[5]).css("margin-right","0px")
});

$(document).ready(function() {
    $($(".zzjd ul li")[2]).css("margin-right","0px");
    $($(".zzjd ul li")[5]).css("margin-right","0px");
});



$(document).ready(function() {
    var $n_li=$(".f_page ul li a");
    $n_li.click(function(){
        $(this).addClass("f_li_bg").parent().siblings().find("a").removeClass("f_li_bg");
    })
});