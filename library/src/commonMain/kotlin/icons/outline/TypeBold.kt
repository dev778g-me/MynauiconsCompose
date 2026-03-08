package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TypeBold: ImageVector
    get() {
        if (_TypeBold != null) {
            return _TypeBold!!
        }
        _TypeBold = ImageVector.Builder(
            name = "Outline.TypeBold",
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
                moveTo(5f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.06f, 0f, 2.078f, 0.474f, 2.828f, 1.318f)
                reflectiveCurveTo(17f, 6.307f, 17f, 7.5f)
                reflectiveCurveToRelative(-0.421f, 2.338f, -1.172f, 3.182f)
                reflectiveCurveTo(14.061f, 12f, 13f, 12f)
                lineTo(5f, 12f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(10.039f)
                arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.154f, 1.318f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 16.5f)
                arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.307f, 3.182f)
                arcTo(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.038f, 21f)
                lineTo(5f, 21f)
                close()
            }
        }.build()

        return _TypeBold!!
    }

@Suppress("ObjectPropertyName")
private var _TypeBold: ImageVector? = null
