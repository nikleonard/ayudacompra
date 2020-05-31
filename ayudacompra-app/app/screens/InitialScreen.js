import "react-native-gesture-handler";
import React from "react";
import { StyleSheet, Text, View, Image } from "react-native";
import { Button } from "react-native-elements";
import { human } from "react-native-typography";

const InitialScreen = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <View style={styles.logo}>
        <Image
          style={{ width: 80, height: 80, resizeMode: "cover" }}
          source={require("../../assets/ayudaCompra.png")}
        />
        <Text style={human.title1}>AyudaCompra</Text>
      </View>
      <Button
        large
        rightIcon={{ name: "HelpRequestButton" }}
        title="Solicitar Ayuda"
        buttonStyle={{
          width: "100%",
          marginBottom: "2%",
        }}
        onPress={() => navigation.navigate("HelpRequestScreen")}
      />

      <Button
        large
        rightIcon={{ name: "requestDashboardButton" }}
        title="Entregar Ayuda"
        buttonStyle={{
          backgroundColor: "#27AE60",
          width: "100%",
        }}
        onPress={() => navigation.navigate("RequestDashboardScreen")}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  logo: {
    alignItems: "center",
    justifyContent: "flex-end",
    marginBottom: 20,
  },
});

export default InitialScreen;
