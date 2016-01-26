/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 */
'use strict';
var React = require('react-native');

var {
    AppRegistry,
    StyleSheet,
    Text,
    View,
    TouchableOpacity,
    NativeModules,
    PropTypes,
    Alert
} = React;

var MyToast = require("./ToastAndroid");

var requireNativeComponent = require('requireNativeComponent');
var MyTextView = requireNativeComponent('MyTextView', MyProject);
var iface = {
  name : "MyTextView",
  propTypes : {
    text : PropTypes.string
  }
};

class MyProject extends React.Component{

  constructor(props) {
    super(props);
  }

  handleHotelClick (e) {
    //调用自定义的原生模块
    MyToast.show('Awesome', MyToast.SHORT, (data) => {Alert.alert(data)});
  }

  render() {
    return (
        <View style = {styles.container}>
          <View style = {styles.item}>
            <View style = {styles.textItme}>
              <TouchableOpacity
                  onPress = {this.handleHotelClick}>
                <MyTextView style = {{width:100, height:50}} text = "问我我我我我"></MyTextView>
              </TouchableOpacity>
            </View>
          </View>
          <View style = {[styles.item, styles.lineLeftRight]}>
            <View style = {[styles.textItme, styles.lineCenter]}>
              <Text style = {styles.text}>海外酒店</Text>
            </View>
            <View style = {styles.textItme}>
              <Text style = {styles.text}>特惠酒店</Text>
            </View>
          </View>
          <View style = {styles.item}>
            <View style = {[styles.textItme, styles.lineCenter]}>
              <Text style = {styles.text}>团购</Text>
            </View>
            <View style = {styles.textItme}>
              <Text style = {styles.text}>客栈公寓</Text>
            </View>
          </View>
        </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex : 1,
    flexDirection : "row",
    marginTop : 25,
    marginLeft : 5,
    marginRight : 5,
    borderRadius : 5,
    height : 84
  },
  item: {
    flex: 1,
    height : 84
  },
  text : {
    color : '#fff',
    textAlign : "center",
    fontSize : 16,
    fontWeight : 'bold',
    backgroundColor : "red"
  },
  textItme : {
    flex : 1,
    justifyContent: "center"
  },
  lineLeftRight : {
    borderLeftWidth:1,
    borderRightWidth:1,
    borderColor:"#fff"
  },
  lineCenter : {
    borderBottomWidth : 1,
    borderColor : '#fff'
  }
});

AppRegistry.registerComponent('ReactnativeDemo', () => MyProject);
