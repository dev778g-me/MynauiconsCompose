package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Trash: ImageVector
    get() {
        if (_Trash != null) {
            return _Trash!!
        }
        _Trash = ImageVector.Builder(
            name = "Filled.Trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.241f, 3.721f)
                lineToRelative(0.293f, 2.029f)
                lineTo(19.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.769f)
                lineToRelative(-0.873f, 10.185f)
                curveToRelative(-0.053f, 0.62f, -0.096f, 1.13f, -0.165f, 1.542f)
                curveToRelative(-0.07f, 0.429f, -0.177f, 0.813f, -0.386f, 1.169f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.401f, 1.287f)
                curveToRelative(-0.372f, 0.177f, -0.764f, 0.25f, -1.198f, 0.284f)
                curveToRelative(-0.417f, 0.033f, -0.928f, 0.033f, -1.55f, 0.033f)
                horizontalLineToRelative(-2.316f)
                curveToRelative(-0.622f, 0f, -1.133f, 0f, -1.55f, -0.033f)
                curveToRelative(-0.434f, -0.034f, -0.826f, -0.107f, -1.198f, -0.284f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.401f, -1.287f)
                curveToRelative(-0.21f, -0.356f, -0.315f, -0.74f, -0.386f, -1.169f)
                curveToRelative(-0.069f, -0.413f, -0.112f, -0.922f, -0.165f, -1.542f)
                lineTo(5.269f, 7.25f)
                lineTo(4.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.966f)
                lineToRelative(0.293f, -2.029f)
                lineToRelative(0.011f, -0.061f)
                curveToRelative(0.182f, -0.79f, 0.86f, -1.41f, 1.71f, -1.41f)
                horizontalLineToRelative(3.04f)
                curveToRelative(0.85f, 0f, 1.528f, 0.62f, 1.71f, 1.41f)
                close()
                moveTo(9.981f, 5.75f)
                horizontalLineToRelative(4.037f)
                lineToRelative(-0.256f, -1.776f)
                curveToRelative(-0.048f, -0.167f, -0.17f, -0.224f, -0.243f, -0.224f)
                horizontalLineToRelative(-3.038f)
                curveToRelative(-0.073f, 0f, -0.195f, 0.057f, -0.243f, 0.224f)
                close()
                moveTo(11.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(14.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _Trash!!
    }

@Suppress("ObjectPropertyName")
private var _Trash: ImageVector? = null
