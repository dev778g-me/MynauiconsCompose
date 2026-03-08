package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShieldTwo: ImageVector
    get() {
        if (_ShieldTwo != null) {
            return _ShieldTwo!!
        }
        _ShieldTwo = ImageVector.Builder(
            name = "Outline.ShieldTwo",
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
                verticalLineTo(6.16f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.457f, -0.506f)
                curveToRelative(-1.998f, -0.2f, -3.915f, -0.89f, -5.582f, -2.009f)
                lineTo(12f, 3f)
                moveToRelative(0f, 18f)
                reflectiveCurveToRelative(-7f, -4.6f, -7f, -10f)
                verticalLineTo(6.16f)
                curveToRelative(0f, -0.261f, 0.198f, -0.48f, 0.457f, -0.506f)
                curveToRelative(1.998f, -0.2f, 3.915f, -0.89f, 5.582f, -2.009f)
                lineTo(12f, 3f)
                moveToRelative(0f, 18f)
                verticalLineTo(3f)
            }
        }.build()

        return _ShieldTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldTwo: ImageVector? = null
