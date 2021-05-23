(function ($) {
	  //默认参数
	  var defaluts = {
	    version: 'v 1.0',
	  };
	 
	//MyPlugin用来存放用户的jQuery元素对象和传递过来的参数
    function MyPlugin($ele, options) {
        this.$ele = $ele;
        this.options = options;
        this.init();
    }

    MyPlugin.prototype = {
        constructor: MyPlugin,
        init: function () {
        	//初始化方法
          console.log(this.options); 
        },
        getVersion: function(){
	    //操作方法，获取传递参数的version值
	    //在操作方法中我们可以调用公共方法和私有方法
        console.log($.fn.myPlugin.outterFunction("plugin template"));	
        console.log(innerFunction());
	    return this.options.version;
        }	
   };

  $.fn.myPlugin= function (options) {
      var opts = $.extend({}, defaluts, options); //使用jQuery.extend 覆盖插件默认参数
      return new MyPlugin($(this), options);
    };

  //公共的格式化方法. 默认是加粗，用户可以通过覆盖该方法达到不同的格式化效果。
  $.fn.myPlugin.outterFunction = function (str) {
    return "<strong>" + str + "</strong>";
  };

  //私有方法，检测参数是否合法
  function innerFunction() {
    return "innerFunction";
  }

})(jQuery);
