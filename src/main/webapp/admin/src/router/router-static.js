import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import wodeqianbao from '@/views/modules/wodeqianbao/list'
    import discussdianchishangpin from '@/views/modules/discussdianchishangpin/list'
    import fuwudingdan from '@/views/modules/fuwudingdan/list'
    import goumaidingdan from '@/views/modules/goumaidingdan/list'
    import discusschongdianzhuang from '@/views/modules/discusschongdianzhuang/list'
    import discusstuosongfuwu from '@/views/modules/discusstuosongfuwu/list'
    import peisongxinxi from '@/views/modules/peisongxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import chongdianzhuang from '@/views/modules/chongdianzhuang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dianchishangpin from '@/views/modules/dianchishangpin/list'
    import tuosongfuwu from '@/views/modules/tuosongfuwu/list'
    import xiaofeixinxi from '@/views/modules/xiaofeixinxi/list'
    import config from '@/views/modules/config/list'
    import chongzhixinxi from '@/views/modules/chongzhixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/wodeqianbao',
        name: '我的钱包',
        component: wodeqianbao
      }
      ,{
	path: '/discussdianchishangpin',
        name: '电池商品评论',
        component: discussdianchishangpin
      }
      ,{
	path: '/fuwudingdan',
        name: '服务订单',
        component: fuwudingdan
      }
      ,{
	path: '/goumaidingdan',
        name: '购买订单',
        component: goumaidingdan
      }
      ,{
	path: '/discusschongdianzhuang',
        name: '充电桩评论',
        component: discusschongdianzhuang
      }
      ,{
	path: '/discusstuosongfuwu',
        name: '托送服务评论',
        component: discusstuosongfuwu
      }
      ,{
	path: '/peisongxinxi',
        name: '配送信息',
        component: peisongxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/chongdianzhuang',
        name: '充电桩',
        component: chongdianzhuang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/dianchishangpin',
        name: '电池商品',
        component: dianchishangpin
      }
      ,{
	path: '/tuosongfuwu',
        name: '托送服务',
        component: tuosongfuwu
      }
      ,{
	path: '/xiaofeixinxi',
        name: '消费信息',
        component: xiaofeixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/chongzhixinxi',
        name: '充值信息',
        component: chongzhixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
