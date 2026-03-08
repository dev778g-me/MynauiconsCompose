package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CopyrightOff: ImageVector
    get() {
        if (_CopyrightOff != null) {
            return _CopyrightOff!!
        }
        _CopyrightOff = ImageVector.Builder(
            name = "Filled.CopyrightOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.25f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.344f, 2.346f)
                lineTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-2.126f, 2.126f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.344f, -2.346f)
                lineTo(3.53f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(2.126f, -2.126f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                moveTo(12f, 7.25f)
                curveToRelative(-1.32f, 0f, -2.32f, 0.647f, -2.962f, 1.572f)
                curveToRelative(-0.628f, 0.902f, -0.917f, 2.06f, -0.917f, 3.178f)
                curveToRelative(0f, 0.8f, 0.149f, 1.622f, 0.463f, 2.355f)
                lineToRelative(1.18f, -1.18f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.622f, 12f)
                curveToRelative(0f, -0.883f, 0.233f, -1.724f, 0.648f, -2.322f)
                curveToRelative(0.4f, -0.575f, 0.965f, -0.928f, 1.73f, -0.928f)
                curveToRelative(0.652f, 0f, 1.043f, 0.254f, 1.416f, 0.72f)
                lineToRelative(0.025f, 0.03f)
                lineToRelative(1.065f, -1.066f)
                curveTo(13.927f, 7.75f, 13.155f, 7.25f, 12f, 7.25f)
                moveToRelative(2.585f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, -0.94f)
                curveToRelative(-0.373f, 0.466f, -0.763f, 0.72f, -1.415f, 0.72f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.523f, -0.666f)
                lineToRelative(-1.061f, 1.06f)
                arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16.75f)
                curveToRelative(1.208f, 0f, 1.998f, -0.548f, 2.585f, -1.28f)
            }
        }.build()

        return _CopyrightOff!!
    }

@Suppress("ObjectPropertyName")
private var _CopyrightOff: ImageVector? = null
