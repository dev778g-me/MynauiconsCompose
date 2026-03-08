package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CodeCircle: ImageVector
    get() {
        if (_CodeCircle != null) {
            return _CodeCircle!!
        }
        _CodeCircle = ImageVector.Builder(
            name = "Outline.CodeCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.908f, 9.7f)
                lineToRelative(0.132f, 0.131f)
                curveToRelative(1.022f, 1.022f, 1.534f, 1.534f, 1.534f, 2.169f)
                reflectiveCurveToRelative(-0.512f, 1.146f, -1.534f, 2.169f)
                lineToRelative(-0.132f, 0.132f)
                moveTo(13.072f, 8f)
                lineToRelative(-2.143f, 8f)
                moveTo(9.092f, 9.7f)
                lineToRelative(-0.132f, 0.131f)
                curveTo(7.938f, 10.853f, 7.427f, 11.365f, 7.427f, 12f)
                reflectiveCurveToRelative(0.51f, 1.146f, 1.533f, 2.169f)
                lineToRelative(0.132f, 0.132f)
            }
        }.build()

        return _CodeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CodeCircle: ImageVector? = null
