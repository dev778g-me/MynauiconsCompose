package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShieldCrossed: ImageVector
    get() {
        if (_ShieldCrossed != null) {
            return _ShieldCrossed!!
        }
        _ShieldCrossed = ImageVector.Builder(
            name = "Outline.ShieldCrossed",
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
                moveTo(12f, 21f)
                reflectiveCurveToRelative(7f, -4.6f, 7f, -10f)
                moveToRelative(-7f, 10f)
                reflectiveCurveToRelative(-7f, -4.6f, -7f, -10f)
                moveToRelative(7f, 10f)
                verticalLineTo(3f)
                moveToRelative(7f, 8f)
                verticalLineTo(6.16f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.457f, -0.506f)
                curveToRelative(-1.998f, -0.2f, -3.915f, -0.89f, -5.582f, -2.009f)
                lineTo(12f, 3f)
                moveToRelative(7f, 8f)
                horizontalLineTo(5f)
                moveToRelative(7f, -8f)
                lineToRelative(-0.961f, 0.645f)
                arcToRelative(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.582f, 2.01f)
                arcTo(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6.16f)
                verticalLineTo(11f)
            }
        }.build()

        return _ShieldCrossed!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCrossed: ImageVector? = null
