package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Outline.Music",
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
                moveTo(8.625f, 17.65f)
                curveToRelative(0f, 1.574f, -1.26f, 2.85f, -2.812f, 2.85f)
                curveTo(4.259f, 20.5f, 3f, 19.224f, 3f, 17.65f)
                curveToRelative(0f, -1.573f, 1.26f, -2.849f, 2.813f, -2.849f)
                reflectiveCurveToRelative(2.812f, 1.276f, 2.812f, 2.85f)
                moveToRelative(0f, 0f)
                verticalLineTo(5.462f)
                curveToRelative(0f, -0.52f, 0.394f, -0.954f, 0.909f, -1.001f)
                lineToRelative(10.375f, -0.956f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4.506f)
                verticalLineTo(16.51f)
                moveToRelative(0f, 0f)
                curveToRelative(0f, 1.573f, -1.26f, 2.85f, -2.812f, 2.85f)
                curveToRelative(-1.554f, 0f, -2.813f, -1.277f, -2.813f, -2.85f)
                reflectiveCurveToRelative(1.26f, -2.85f, 2.813f, -2.85f)
                reflectiveCurveTo(21f, 14.938f, 21f, 16.512f)
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
