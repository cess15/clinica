(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["editarHabitacion"],{"0090":function(t,e,a){"use strict";var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("b-nav",{staticClass:"bg-light",attrs:{tabs:""}},[a("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"habitaciones"}}},[t._v("Todos los Registros")]),a("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"nuevaHabitacion"}}},[t._v("Registrar")])],1)},o=[],s={name:"navBedRoom"},n=s,r=a("2877"),l=Object(r["a"])(n,i,o,!1,null,null,null);e["a"]=l.exports},3893:function(t,e,a){"use strict";a.r(e);var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("navBedRoom"),a("div",{staticClass:"container bg-light"},[t._m(0),a("h3",{staticClass:"text-center text-dark"},[t._v("Realice los cambios que desea modificar")]),a("div",{staticStyle:{width:"400px"}},[null!==t.isCorrect?a("b-alert",{staticStyle:{width:"400px"},attrs:{show:"",variant:"danger"}},[a("h4",{staticClass:"alert-heading"},[t._v(t._s(t.avise))]),a("p",[t._v(t._s(t.message))])]):t._e()],1),a("form",{on:{submit:t.save}},[a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-6"},[a("label",{attrs:{for:"genero"}},[t._v("Género")]),a("select",{directives:[{name:"model",rawName:"v-model.number",value:t.genero.id,expression:"genero.id",modifiers:{number:!0}}],staticClass:"custom-select",attrs:{id:"genero",required:""},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(e){var a="_value"in e?e._value:e.value;return t._n(a)});t.$set(t.genero,"id",e.target.multiple?a:a[0])}}},[a("option",{attrs:{disabled:"",value:""}},[t._v("--Seleccione--")]),a("option",{attrs:{value:"1"}},[t._v("Masculino")]),a("option",{attrs:{value:"2"}},[t._v("Femenino")])])]),a("div",{staticClass:"col-md-6"},[a("label",{attrs:{for:"tipoHabitacion"}},[t._v("Tipo de Habitación")]),a("select",{directives:[{name:"model",rawName:"v-model.number",value:t.tipoHabitacion.id,expression:"tipoHabitacion.id",modifiers:{number:!0}}],staticClass:"custom-select",attrs:{id:"tipoHabitacion",required:""},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(e){var a="_value"in e?e._value:e.value;return t._n(a)});t.$set(t.tipoHabitacion,"id",e.target.multiple?a:a[0])}}},[a("option",{attrs:{disabled:"",value:""}},[t._v("--Seleccione--")]),a("option",{attrs:{value:"1"}},[t._v("Simple")]),a("option",{attrs:{value:"2"}},[t._v("Doble")])])])]),a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"tipoDocumento"}},[t._v("Piso")]),a("select",{directives:[{name:"model",rawName:"v-model.number",value:t.piso.id,expression:"piso.id",modifiers:{number:!0}}],staticClass:"custom-select",attrs:{id:"piso",required:""},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(e){var a="_value"in e?e._value:e.value;return t._n(a)});t.$set(t.piso,"id",e.target.multiple?a:a[0])}}},[a("option",{attrs:{disabled:"",value:""}},[t._v("--Seleccione--")]),a("option",{attrs:{value:"1"}},[t._v("Planta Baja")]),a("option",{attrs:{value:"2"}},[t._v("Segundo Piso")]),a("option",{attrs:{value:"3"}},[t._v("Tercer Piso")]),a("option",{attrs:{value:"4"}},[t._v("Cuarto Piso")]),a("option",{attrs:{value:"5"}},[t._v("Quinto Piso")]),a("option",{attrs:{value:"6"}},[t._v("Ultimo Piso")])])]),a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"tipoDocumento"}},[t._v("Estado Habitación")]),a("select",{directives:[{name:"model",rawName:"v-model.number",value:t.estadoHabitacion.id,expression:"estadoHabitacion.id",modifiers:{number:!0}}],staticClass:"custom-select",attrs:{disabled:"",id:"estadoHabitacion",required:""},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(e){var a="_value"in e?e._value:e.value;return t._n(a)});t.$set(t.estadoHabitacion,"id",e.target.multiple?a:a[0])}}},[a("option",{attrs:{disabled:"",value:""}},[t._v("--Seleccione--")]),a("option",{attrs:{value:"1"}},[t._v("Disponible")]),a("option",{attrs:{value:"2"}},[t._v("Ocupada")])])]),a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"numero"}},[t._v("Número de Habitación")]),a("input",{directives:[{name:"model",rawName:"v-model",value:t.bedroom.numero,expression:"bedroom.numero"}],staticClass:"form-control",attrs:{placeholder:"Número de Habitación",type:"text",required:""},domProps:{value:t.bedroom.numero},on:{input:function(e){e.target.composing||t.$set(t.bedroom,"numero",e.target.value)}}})])]),t._m(1)])]),a("Footer")],1)},o=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("h1",{staticClass:"text-center text-dark p-5"},[a("b",[t._v("Datos de Habitación")])])},function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"form-row p-5"},[a("button",{staticClass:"btn btn-primary"},[t._v("Enviar")])])}],s=(a("96cf"),a("3b8d")),n=a("7eac"),r=a("bc3a"),l=a.n(r),c=a("0090"),u=a("fd2d"),d={name:"editarHabitacion",data:function(){return{id:this.$route.params.id,piso:{id:null},estadoHabitacion:{id:null},tipoHabitacion:{id:null},genero:{id:null},bedroom:[],message:null,avise:null,isCorrect:null}},methods:{findById:function(){var t=Object(s["a"])(regeneratorRuntime.mark(function t(){var e=this;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:l.a.get("".concat(n["a"],"/api/habitacion/").concat(this.id)).then(function(t){e.piso=t.data.piso,e.estadoHabitacion=t.data.estadoHabitacion,e.tipoHabitacion=t.data.tipoHabitacion,e.genero=t.data.genero,e.bedroom=t.data}).catch(function(t){n["b"].alert({title:"Error",message:t.response.data.mensaje,locale:"es",backdrop:!0,callback:e.$router.push("/habitaciones")}),console.log("Error "+t.response.status+" Not Found")});case 1:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}(),save:function(t){var e=this;t.preventDefault(),this.avise="",this.message="",l.a.put("".concat(n["a"],"/api/habitacion/").concat(this.id),{piso:{id:this.piso.id},estadoHabitacion:{id:this.estadoHabitacion.id},tipoHabitacion:{id:this.tipoHabitacion.id},genero:{id:this.genero.id},numero:this.bedroom.numero}).then(function(t){n["b"].alert({title:"Datos Actualizados",message:t.data.mensaje,locale:"es",backdrop:!0,callback:e.$router.push("/habitaciones")})}).catch(function(t){e.avise="Error",e.isCorrect=!1,e.message="Detalle: "+t.response.data.mensaje,n["b"].alert({title:"Error",message:"No se pudo editar",locale:"es",backdrop:!0}),console.log("Error "+t.response.status+" Conflict")})}},components:{navBedRoom:c["a"],Footer:u["a"]},mounted:function(){this.findById()}},v=d,m=a("2877"),p=Object(m["a"])(v,i,o,!1,null,null,null);e["default"]=p.exports}}]);
//# sourceMappingURL=editarHabitacion.0903a4ba.js.map