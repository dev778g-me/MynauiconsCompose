package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CodeDiamond: ImageVector
    get() {
        if (_CodeDiamond != null) {
            return _CodeDiamond!!
        }
        _CodeDiamond = ImageVector.Builder(
            name = "Outline.CodeDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.908f, 9.7f)
                lineToRelative(0.132f, 0.131f)
                curveToRelative(1.022f, 1.023f, 1.534f, 1.534f, 1.534f, 2.169f)
                reflectiveCurveToRelative(-0.512f, 1.147f, -1.534f, 2.17f)
                lineToRelative(-0.132f, 0.13f)
                moveTo(13.072f, 8f)
                lineToRelative(-2.143f, 8f)
                moveTo(9.092f, 9.7f)
                lineToRelative(-0.132f, 0.131f)
                curveTo(7.938f, 10.854f, 7.427f, 11.365f, 7.427f, 12f)
                reflectiveCurveToRelative(0.51f, 1.147f, 1.533f, 2.17f)
                lineToRelative(0.132f, 0.13f)
            }
        }.build()

        return _CodeDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _CodeDiamond: ImageVector? = null
