package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FilterOne: ImageVector
    get() {
        if (_FilterOne != null) {
            return _FilterOne!!
        }
        _FilterOne = ImageVector.Builder(
            name = "Filled.FilterOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.175f, 3.25f)
                horizontalLineToRelative(9.65f)
                curveToRelative(0.46f, 0f, 0.855f, 0f, 1.167f, 0.028f)
                curveToRelative(0.31f, 0.029f, 0.679f, 0.094f, 0.986f, 0.33f)
                curveToRelative(0.406f, 0.313f, 0.652f, 0.79f, 0.672f, 1.3f)
                curveToRelative(0.015f, 0.389f, -0.145f, 0.727f, -0.301f, 0.997f)
                curveToRelative(-0.157f, 0.27f, -0.386f, 0.593f, -0.652f, 0.968f)
                lineTo(15.43f, 11.48f)
                curveToRelative(-0.337f, 0.474f, -0.448f, 0.636f, -0.526f, 0.806f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.163f, 0.51f)
                curveToRelative(-0.034f, 0.184f, -0.037f, 0.38f, -0.037f, 0.962f)
                verticalLineToRelative(5.872f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, 0.668f)
                curveToRelative(-0.99f, 0.505f, -2.203f, 0.608f, -3.205f, 0.202f)
                curveToRelative(-1.057f, -0.427f, -1.812f, -1.401f, -1.793f, -2.829f)
                verticalLineToRelative(-3.913f)
                curveToRelative(0f, -0.582f, -0.003f, -0.778f, -0.037f, -0.961f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.163f, -0.511f)
                curveToRelative(-0.078f, -0.17f, -0.19f, -0.332f, -0.526f, -0.806f)
                lineTo(5.303f, 6.873f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.652f, -0.968f)
                curveToRelative(-0.156f, -0.27f, -0.316f, -0.608f, -0.301f, -0.996f)
                curveToRelative(0.02f, -0.512f, 0.266f, -0.988f, 0.672f, -1.3f)
                curveToRelative(0.307f, -0.237f, 0.676f, -0.302f, 0.986f, -0.33f)
                curveToRelative(0.312f, -0.029f, 0.708f, -0.029f, 1.167f, -0.029f)
                moveToRelative(3.673f, 14.94f)
                curveToRelative(0.119f, 0.485f, 0.427f, 0.767f, 0.804f, 0.92f)
                curveToRelative(0.423f, 0.171f, 0.97f, 0.188f, 1.499f, 0.035f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.194f, -0.448f)
                arcToRelative(1.27f, 1.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.608f, -0.463f)
                curveToRelative(-0.418f, -0.162f, -0.963f, -0.178f, -1.5f, -0.043f)
            }
        }.build()

        return _FilterOne!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOne: ImageVector? = null
