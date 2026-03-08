package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Campfire: ImageVector
    get() {
        if (_Campfire != null) {
            return _Campfire!!
        }
        _Campfire = ImageVector.Builder(
            name = "Outline.Campfire",
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
                moveTo(16.385f, 11.568f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.5f)
                curveToRelative(-2.623f, 0f, -4.75f, -2.134f, -4.75f, -4.767f)
                curveToRelative(0f, -2.632f, 0.998f, -3.709f, 2.558f, -6.233f)
                curveToRelative(2.923f, 1.283f, 2.923f, 5.133f, 2.923f, 5.133f)
                reflectiveCurveToRelative(0.96f, -1.856f, 2.923f, -2.75f)
                curveToRelative(0.63f, 1.86f, 1.478f, 3.89f, 0.731f, 5.685f)
                moveTo(5f, 21f)
                curveToRelative(4.46f, -2.23f, 9.12f, -3.954f, 14f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21f)
                curveToRelative(-4.47f, -2.235f, -9.104f, -3.95f, -14f, -5f)
            }
        }.build()

        return _Campfire!!
    }

@Suppress("ObjectPropertyName")
private var _Campfire: ImageVector? = null
