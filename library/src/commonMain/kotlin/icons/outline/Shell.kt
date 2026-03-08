package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Shell: ImageVector
    get() {
        if (_Shell != null) {
            return _Shell!!
        }
        _Shell = ImageVector.Builder(
            name = "Outline.Shell",
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
                moveTo(12f, 8f)
                verticalLineToRelative(5f)
                moveToRelative(4.13f, -2.984f)
                lineToRelative(-0.777f, 2.898f)
                moveTo(7.87f, 10.018f)
                lineToRelative(0.777f, 2.898f)
                moveToRelative(-4.624f, 1.167f)
                lineToRelative(5.24f, 3.573f)
                curveToRelative(0.347f, 0.236f, 0.51f, 0.667f, 0.41f, 1.079f)
                curveToRelative(-0.158f, 0.646f, -0.133f, 1.424f, 0.68f, 1.59f)
                curveToRelative(1.14f, 0.234f, 1.878f, 0.233f, 3.014f, 0f)
                curveToRelative(0.838f, -0.171f, 0.83f, -0.975f, 0.67f, -1.63f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.365f, -1.046f)
                lineToRelative(5.517f, -3.566f)
                curveToRelative(0.883f, -0.679f, 0.735f, -3.6f, -0.278f, -4.13f)
                curveToRelative(-0.282f, -0.147f, -0.483f, -0.535f, -0.36f, -0.83f)
                curveToRelative(0.803f, -1.948f, -0.946f, -3.044f, -2.171f, -3.42f)
                arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.278f, -0.257f)
                curveToRelative(-1.163f, -2.857f, -3.487f, -1.986f, -4.728f, -1.034f)
                arcToRelative(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.503f, 0.02f)
                curveTo(9.14f, 2.81f, 7.839f, 4.536f, 7.403f, 5.86f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.399f, 0.312f)
                curveToRelative(-2.432f, 0.144f, -2.685f, 2.004f, -2.417f, 3.387f)
                curveToRelative(0.062f, 0.32f, -0.256f, 0.637f, -0.529f, 0.807f)
                curveToRelative(-0.71f, 0.443f, -0.766f, 3.218f, -0.035f, 3.717f)
            }
        }.build()

        return _Shell!!
    }

@Suppress("ObjectPropertyName")
private var _Shell: ImageVector? = null
