package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cupcake: ImageVector
    get() {
        if (_Cupcake != null) {
            return _Cupcake!!
        }
        _Cupcake = ImageVector.Builder(
            name = "Filled.Cupcake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.135f, 14.75f)
                lineTo(15.65f, 14.75f)
                lineToRelative(-0.785f, 5.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.466f, 0f, 0.594f, -0.078f, 0.632f, -0.11f)
                curveToRelative(0.034f, -0.029f, 0.139f, -0.141f, 0.207f, -0.619f)
                close()
                moveTo(13.349f, 20.25f)
                lineTo(14.135f, 14.75f)
                horizontalLineToRelative(-4.27f)
                lineToRelative(0.785f, 5.5f)
                close()
                moveTo(9.135f, 20.25f)
                lineTo(8.349f, 14.75f)
                lineTo(5.865f, 14.75f)
                lineToRelative(0.681f, 4.77f)
                curveToRelative(0.066f, 0.462f, 0.16f, 0.58f, 0.199f, 0.613f)
                curveToRelative(0.033f, 0.03f, 0.158f, 0.117f, 0.64f, 0.117f)
                close()
                moveTo(4.311f, 14.478f)
                curveToRelative(-1.407f, -0.876f, -2.061f, -2.671f, -2.061f, -4.144f)
                curveToRelative(0f, -1.89f, 1.265f, -3.46f, 2.978f, -4.1f)
                arcToRelative(0.04f, 0.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.016f, -0.013f)
                lineToRelative(0.005f, -0.011f)
                lineToRelative(0.001f, -0.002f)
                curveToRelative(0f, -1.74f, 1.518f, -3.041f, 3.25f, -3.041f)
                curveToRelative(0.224f, 0f, 0.433f, 0.026f, 0.605f, 0.052f)
                lineToRelative(0.151f, 0.023f)
                curveToRelative(0.113f, 0.017f, 0.204f, 0.031f, 0.302f, 0.04f)
                curveToRelative(0.247f, 0.025f, 0.374f, 0.001f, 0.49f, -0.07f)
                arcTo(6.6f, 6.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 2.25f)
                curveToRelative(3.389f, 0f, 6.25f, 2.533f, 6.25f, 5.792f)
                curveToRelative(0f, 0.091f, 0.029f, 0.187f, 0.147f, 0.335f)
                curveToRelative(0.121f, 0.15f, 0.28f, 0.29f, 0.505f, 0.49f)
                quadToRelative(0.046f, 0.039f, 0.095f, 0.084f)
                curveToRelative(0.496f, 0.439f, 1.253f, 1.127f, 1.253f, 2.3f)
                curveToRelative(0f, 1.382f, -0.705f, 2.754f, -2.073f, 3.317f)
                lineToRelative(-0.738f, 5.166f)
                curveToRelative(-0.084f, 0.588f, -0.261f, 1.162f, -0.724f, 1.553f)
                curveToRelative(-0.46f, 0.387f, -1.046f, 0.463f, -1.6f, 0.463f)
                horizontalLineToRelative(-9.23f)
                curveToRelative(-0.595f, 0f, -1.188f, -0.094f, -1.64f, -0.5f)
                curveToRelative(-0.448f, -0.4f, -0.605f, -0.97f, -0.684f, -1.518f)
                close()
            }
        }.build()

        return _Cupcake!!
    }

@Suppress("ObjectPropertyName")
private var _Cupcake: ImageVector? = null
