(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-register-register"],{"28a4":function(r,e,t){var i=t("29a2");"string"===typeof i&&(i=[[r.i,i,""]]),i.locals&&(r.exports=i.locals);var o=t("4f06").default;o("0fe2bdd2",i,!0,{sourceMap:!1,shadowMode:!1})},"29a2":function(r,e,t){var i=t("24fb");e=i(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-2431ea7c]{height:calc(100vh - 44px);overflow:auto}.content[data-v-2431ea7c]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220215/ce71c8df1000442da176e02f4a942a7c.png);background-attachment:fixed;background-size:cover;background-position:50%}.logo[data-v-2431ea7c]{text-align:center}.logo uni-image[data-v-2431ea7c]{height:%?200?%;width:%?200?%;margin:0 0 %?60?%}.uni-form-item[data-v-2431ea7c]{margin-bottom:%?40?%;padding:0}.uni-form-item .uni-input[data-v-2431ea7c]{font-size:%?30?%;padding:7px 0}uni-button[type="primary"][data-v-2431ea7c]{background-color:#b49950;border-radius:0;font-size:%?34?%;margin-top:%?60?%}.links[data-v-2431ea7c]{text-align:center;margin-top:%?40?%;font-size:%?26?%;color:#999}.links uni-view[data-v-2431ea7c]{display:inline-block;vertical-align:top;margin:0 %?10?%}.links .link-highlight[data-v-2431ea7c]{color:#b49950}.picker-select-input[data-v-2431ea7c]{line-height:%?88?%}',""]),r.exports=e},3735:function(r,e,t){"use strict";t.r(e);var i=t("d0fd"),o=t("48c7");for(var a in o)"default"!==a&&function(r){t.d(e,r,(function(){return o[r]}))}(a);t("53d7"),t("7886");var n,d=t("f0c5"),u=Object(d["a"])(o["default"],i["b"],i["c"],!1,null,"2431ea7c",null,!1,i["a"],n);e["default"]=u.exports},"38cf":function(r,e,t){var i=t("b5cd");"string"===typeof i&&(i=[[r.i,i,""]]),i.locals&&(r.exports=i.locals);var o=t("4f06").default;o("23d6794c",i,!0,{sourceMap:!1,shadowMode:!1})},"48c7":function(r,e,t){"use strict";t.r(e);var i=t("4e2d"),o=t.n(i);for(var a in i)"default"!==a&&function(r){t.d(e,r,(function(){return i[r]}))}(a);e["default"]=o.a},"4e2d":function(r,e,t){"use strict";var i=t("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,t("28a5"),t("96cf");var o=i(t("3b8d")),a={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,ruleForm:{},emailcode:"",tableName:""}},onLoad:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){var e;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:[],e=uni.getStorageSync("loginTable"),this.tableName=e,"yonghu"==this.tableName&&(this.yonghuxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.yonghuxingbieOptions[0]),this.styleChange();case 5:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),methods:{yonghuxingbieChange:function(r){this.yonghuxingbieIndex=r.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(this.ruleForm.zhanghao||"yonghu"!=this.tableName){r.next=3;break}return this.$utils.msg("账号不能为空"),r.abrupt("return");case 3:if(this.ruleForm.mima||"yonghu"!=this.tableName){r.next=6;break}return this.$utils.msg("密码不能为空"),r.abrupt("return");case 6:if("yonghu"!=this.tableName||this.ruleForm.mima==this.ruleForm.mima2){r.next=9;break}return this.$utils.msg("两次密码输入不一致"),r.abrupt("return");case 9:if(this.ruleForm.xingming||"yonghu"!=this.tableName){r.next=12;break}return this.$utils.msg("姓名不能为空"),r.abrupt("return");case 12:if("yonghu"!=this.tableName||!this.ruleForm.youxiang||this.$validate.isEmail(this.ruleForm.youxiang)){r.next=15;break}return this.$utils.msg("邮箱应输入邮件格式"),r.abrupt("return");case 15:if("yonghu"!=this.tableName||!this.ruleForm.shoujihaoma||this.$validate.isMobile(this.ruleForm.shoujihaoma)){r.next=18;break}return this.$utils.msg("手机号码应输入手机格式"),r.abrupt("return");case 18:return r.next=20,this.$api.register("".concat(this.tableName),this.ruleForm,this.emailcode);case 20:this.$utils.msgBack("注册成功");case 22:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}()}};e.default=a},"53d7":function(r,e,t){"use strict";var i=t("38cf"),o=t.n(i);o.a},7886:function(r,e,t){"use strict";var i=t("28a4"),o=t.n(i);o.a},b5cd:function(r,e,t){var i=t("24fb");e=i(!1),e.push([r.i,".btn-submit[data-v-2431ea7c]{height:auto!important;line-height:%?200?%}",""]),r.exports=e},d0fd:function(r,e,t){"use strict";var i,o=function(){var r=this,e=r.$createElement,t=r._self._c||e;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{staticClass:"box",style:{padding:"48rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 auto",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.5)",borderRadius:"0",borderWidth:"0",width:"96%",borderStyle:"solid",height:"100%"}},[t("v-uni-view",{staticClass:"logo",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-image",{style:{padding:"0",boxShadow:"0 0 0px #59f43e",margin:"0 auto",borderColor:"#ccc",borderRadius:"50%",borderWidth:"0",width:"160rpx",borderStyle:"solid",url:"http://codegen.caihongy.cn/20220215/3f51d2afc22a4c89985dda4b49d5626d.jpg",isShow:!0,height:"160rpx"},attrs:{src:"http://codegen.caihongy.cn/20220215/3f51d2afc22a4c89985dda4b49d5626d.jpg",mode:"aspectFill"}})],1),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"账号"},model:{value:r.ruleForm.zhanghao,callback:function(e){r.$set(r.ruleForm,"zhanghao",e)},expression:"ruleForm.zhanghao"}})],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"password",name:"",placeholder:"密码"},model:{value:r.ruleForm.mima,callback:function(e){r.$set(r.ruleForm,"mima",e)},expression:"ruleForm.mima"}})],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"password",name:"",placeholder:"确认密码"},model:{value:r.ruleForm.mima2,callback:function(e){r.$set(r.ruleForm,"mima2",e)},expression:"ruleForm.mima2"}})],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"姓名"},model:{value:r.ruleForm.xingming,callback:function(e){r.$set(r.ruleForm,"xingming",e)},expression:"ruleForm.xingming"}})],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-picker",{attrs:{value:r.yonghuxingbieIndex,range:r.yonghuxingbieOptions},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.yonghuxingbieChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",color:"#333",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",lineHeight:"88rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.xingbie?r.ruleForm.xingbie:"请选择性别"))])],1)],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"邮箱"},model:{value:r.ruleForm.youxiang,callback:function(e){r.$set(r.ruleForm,"youxiang",e)},expression:"ruleForm.youxiang"}})],1):r._e(),"yonghu"==r.tableName?t("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"0",borderColor:"#ccc",backgroundColor:"#fff",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"12rpx",borderWidth:"0",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"手机号码"},model:{value:r.ruleForm.shoujihaoma,callback:function(e){r.$set(r.ruleForm,"shoujihaoma",e)},expression:"ruleForm.shoujihaoma"}})],1):r._e(),t("v-uni-button",{staticClass:"btn-submit",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(239, 184, 101, 1)",borderRadius:"1800rpx 1800rpx 40rpx 40rpx",color:"rgba(255, 255, 255, 1)",borderWidth:"0",width:"100%",fontSize:"40rpx",borderStyle:"solid",height:"200rpx"},attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.register.apply(void 0,arguments)}}},[r._v("注册")])],1)],1)},a=[];t.d(e,"b",(function(){return o})),t.d(e,"c",(function(){return a})),t.d(e,"a",(function(){return i}))}}]);