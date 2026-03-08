package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.UserSettings: ImageVector
    get() {
        if (_UserSettings != null) {
            return _UserSettings!!
        }
        _UserSettings = ImageVector.Builder(
            name = "Outline.UserSettings",
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
                moveTo(15f, 7.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                moveToRelative(4.5f, 13f)
                curveToRelative(-0.475f, -9.333f, -14.525f, -9.333f, -15f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.192f, 17.565f)
                curveToRelative(0.394f, -0.21f, 0.591f, -0.315f, 0.808f, -0.315f)
                reflectiveCurveToRelative(0.414f, 0.105f, 0.808f, 0.315f)
                lineToRelative(0.134f, 0.072f)
                curveToRelative(0.394f, 0.21f, 0.591f, 0.315f, 0.7f, 0.488f)
                reflectiveCurveToRelative(0.108f, 0.383f, 0.108f, 0.804f)
                verticalLineToRelative(0.142f)
                curveToRelative(0f, 0.42f, 0f, 0.63f, -0.108f, 0.804f)
                curveToRelative(-0.109f, 0.173f, -0.306f, 0.278f, -0.7f, 0.488f)
                lineToRelative(-0.134f, 0.072f)
                curveToRelative(-0.394f, 0.21f, -0.591f, 0.315f, -0.808f, 0.315f)
                reflectiveCurveToRelative(-0.414f, -0.105f, -0.808f, -0.315f)
                lineToRelative(-0.134f, -0.072f)
                curveToRelative(-0.394f, -0.21f, -0.591f, -0.315f, -0.7f, -0.488f)
                reflectiveCurveToRelative(-0.108f, -0.383f, -0.108f, -0.804f)
                verticalLineToRelative(-0.142f)
                curveToRelative(0f, -0.42f, 0f, -0.63f, 0.108f, -0.804f)
                curveToRelative(0.109f, -0.173f, 0.306f, -0.278f, 0.7f, -0.488f)
                close()
            }
        }.build()

        return _UserSettings!!
    }

@Suppress("ObjectPropertyName")
private var _UserSettings: ImageVector? = null
