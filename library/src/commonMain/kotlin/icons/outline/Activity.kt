package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Activity: ImageVector
    get() {
        if (_Activity != null) {
            return _Activity!!
        }
        _Activity = ImageVector.Builder(
            name = "Outline.Activity",
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
                horizontalLineToRelative(-2.962f)
                curveToRelative(-0.21f, 0f, -0.316f, 0f, -0.405f, 0.042f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.201f, 0.173f)
                curveToRelative(-0.061f, 0.088f, -0.092f, 0.205f, -0.155f, 0.44f)
                lineToRelative(-1.817f, 6.846f)
                curveToRelative(-0.233f, 0.875f, -0.349f, 1.313f, -0.524f, 1.426f)
                arcToRelative(0.435f, 0.435f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.485f, -0.002f)
                curveToRelative(-0.175f, -0.115f, -0.288f, -0.554f, -0.514f, -1.43f)
                lineToRelative(-3.873f, -14.99f)
                curveToRelative(-0.227f, -0.876f, -0.34f, -1.315f, -0.515f, -1.43f)
                arcToRelative(0.435f, 0.435f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.485f, -0.002f)
                curveToRelative(-0.175f, 0.113f, -0.291f, 0.55f, -0.524f, 1.426f)
                lineToRelative(-1.817f, 6.845f)
                curveToRelative(-0.063f, 0.236f, -0.094f, 0.353f, -0.154f, 0.44f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.202f, 0.174f)
                curveTo(6.278f, 12f, 6.173f, 12f, 5.962f, 12f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Activity!!
    }

@Suppress("ObjectPropertyName")
private var _Activity: ImageVector? = null
