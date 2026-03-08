package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BriefcaseMedical: ImageVector
    get() {
        if (_BriefcaseMedical != null) {
            return _BriefcaseMedical!!
        }
        _BriefcaseMedical = ImageVector.Builder(
            name = "Outline.BriefcaseMedical",
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
                moveTo(8.308f, 21f)
                horizontalLineToRelative(7.384f)
                moveToRelative(-7.384f, 0f)
                curveToRelative(-3.71f, 0f, -4.375f, -1.449f, -4.569f, -3.213f)
                lineToRelative(-0.692f, -7.2f)
                curveTo(2.797f, 8.391f, 3.444f, 6.6f, 7.385f, 6.6f)
                moveTo(8.308f, 21f)
                curveToRelative(-1.584f, -4.634f, -1.949f, -9.6f, -0.923f, -14.4f)
                moveTo(15.692f, 21f)
                curveToRelative(3.71f, 0f, 4.375f, -1.449f, 4.569f, -3.213f)
                lineToRelative(0.692f, -7.2f)
                curveToRelative(0.25f, -2.196f, -0.397f, -3.987f, -4.338f, -3.987f)
                moveTo(15.692f, 21f)
                curveToRelative(1.584f, -4.634f, 1.949f, -9.6f, 0.923f, -14.4f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-9.23f)
                moveTo(15f, 6.6f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.545f, -0.456f, -0.998f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.545f, 0f, -1.002f, 0.456f, -1f, 1f)
                verticalLineToRelative(2.6f)
                moveToRelative(3f, 5.4f)
                verticalLineToRelative(4f)
                moveToRelative(2f, -2f)
                horizontalLineToRelative(-4f)
            }
        }.build()

        return _BriefcaseMedical!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseMedical: ImageVector? = null
